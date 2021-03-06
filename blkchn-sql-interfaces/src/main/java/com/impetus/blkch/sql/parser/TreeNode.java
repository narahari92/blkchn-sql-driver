/*******************************************************************************
* * Copyright 2018 Impetus Infotech.
* *
* * Licensed under the Apache License, Version 2.0 (the "License");
* * you may not use this file except in compliance with the License.
* * You may obtain a copy of the License at
* *
* * http://www.apache.org/licenses/LICENSE-2.0
* *
* * Unless required by applicable law or agreed to in writing, software
* * distributed under the License is distributed on an "AS IS" BASIS,
* * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* * See the License for the specific language governing permissions and
* * limitations under the License.
******************************************************************************/
package com.impetus.blkch.sql.parser;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.impetus.blkch.BlkchnException;
import com.impetus.blkch.sql.query.IdentifierNode;
import com.impetus.blkch.sql.query.Placeholder;

public class TreeNode implements Cloneable, Serializable {
    
    /**
     * 
     */
    private static final long serialVersionUID = -5244526440190973169L;

    private static final Logger logger = LoggerFactory.getLogger(TreeNode.class);

    private List<TreeNode> childNodes = new ArrayList<TreeNode>();

    private TreeNode parent = null;

    private boolean isRootNode = false;

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TreeNode(String description) {
        this.description = description;
    }

    public void addChildNode(TreeNode child) {
        this.childNodes.add(child);
        child.setParent(this);
    }

    public TreeNode setChildNode(TreeNode child, int i) {
        return setPlaceHolderNode(child, i);
    }

    public TreeNode getChildNode(int i) {
        if (i < childNodes.size()) {
            return childNodes.get(i);
        }
        throw new BlkchnException("Index out of Bounds " + i);
    }

    public List<TreeNode> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<TreeNode> childNodes) {
        this.childNodes = childNodes;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public boolean isRootNode() {
        return isRootNode;
    }

    public void setRootNode(boolean isRootNode) {
        this.isRootNode = isRootNode;
    }

    public void traverse(TreeNode node) {
        traverseDepthFirst(node, 0);
    }

    public void traverse() {
        traverseDepthFirst(this, 0);
    }

    private void traverseDepthFirst(TreeNode node, int level) {
        logger.debug(addspace(level * 2, node.getDescription()));
        for (TreeNode childNode : node.getChildNodes()) {
            traverseDepthFirst(childNode, level + 1);
        }
    }

    public String toString() {
        return this.getDescription();
    }

    private String addspace(int i, String str) {
        StringBuilder str1 = new StringBuilder();
        for (int j = 0; j < i; j++) {
            str1.append(" ");
        }
        str1.append(str);
        return str1.toString();
    }

    public boolean hasChildType(Class<? extends TreeNode> clazz) {
        for (TreeNode child : childNodes) {
            if (child.getClass().isAssignableFrom(clazz)) {
                return true;
            }
        }
        return false;
    }

    public <T extends TreeNode> List<T> getChildType(Class<T> clazz) {
        List<T> children = new ArrayList<>();
        for (TreeNode child : childNodes) {
            if (child.getClass().isAssignableFrom(clazz)) {
                children.add((T) child);
            }
        }
        return children;
    }

    public <T extends TreeNode> T getChildType(Class<T> clazz, int index) {
        int i = -1;
        for (TreeNode child : childNodes) {
            if (child.getClass().isAssignableFrom(clazz)) {
                i++;
                if (i == index) {
                    return (T) child;
                }
            }
        }
        return null;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (!this.getClass().isAssignableFrom(obj.getClass())) {
            return false;
        }
        final TreeNode other = (TreeNode) obj;
        if ((this.description == null) ? (other.description != null) : !this.description.equals(other.description)) {
            return false;
        }
        if (this.getChildNodes().size() != other.getChildNodes().size()) {
            return false;
        }
        for (int i = 0; i < this.getChildNodes().size(); i++) {
            if (!this.getChildNode(i).equals(other.getChildNode(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        return hashWithDepth(0);
    }

    private int hashWithDepth(int level) {
        int hash = 3;
        hash = 53 * (hash + (this.description != null ? this.description.hashCode() : 0)) * (level + 1);
        for (int i = 0; i < this.getChildNodes().size(); i++) {
            hash += this.getChildNode(i).hashWithDepth(level + 1) * (i + 1);
        }
        return hash;
    }

    private TreeNode setPlaceHolderNode(TreeNode child, int i) {
        if (i < childNodes.size() && (child instanceof Placeholder || child instanceof IdentifierNode)) {
            this.childNodes.set(i, child);
            return child;
        }
        throw new BlkchnException("Index out of Bounds " + i);
    }
    
    @Override
    public Object clone()  {
        TreeNode root;
        try {
            root = (TreeNode) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new BlkchnException("Cannot perform clone of " + this.getClass().getName() + " class", e);
        }
        root.parent = null;
        root.childNodes = new ArrayList<>();
        for(TreeNode child : childNodes) {
            TreeNode newChild = (TreeNode) child.clone();
            root.addChildNode(newChild);
            newChild.setParent(root);
        }
        return root;
    }
}
