package org.apache.spark.sql.types

import java.math.BigInteger

import org.apache.spark.sql.catalyst.util.{ArrayData, GenericArrayData}
import org.apache.spark.unsafe.types.UTF8String
import org.web3j.protocol.core.methods.response._

@SQLUserDefinedType(udt = classOf[TransactionUTD])
class TransactionType(val transaction:Transaction)  extends Serializable {

  override def hashCode(): Int = transaction.hashCode()

  override def equals(other: Any): Boolean = other match {
    case that: TransactionType => this.transaction == that.transaction
    case _ => false
  }

  override def toString(): String = transaction.getHash
}

private[sql] class TransactionUTD extends UserDefinedType[TransactionType] {

  override def sqlType: DataType = ArrayType(StringType,false)

  override def serialize(p: TransactionType): GenericArrayData = {
    val output = new Array[Any](17)
    val txnInfo = p.transaction
    output(0) = UTF8String.fromString(txnInfo.getBlockHash)
    output(1) = UTF8String.fromString(txnInfo.getBlockNumber.toString)
    output(2) = UTF8String.fromString(txnInfo.getCreates)
    output(3) = UTF8String.fromString(txnInfo.getFrom)
    output(4) = UTF8String.fromString(txnInfo.getGas.toString)
    output(5) = UTF8String.fromString(txnInfo.getGasPrice.toString)
    output(6) = UTF8String.fromString(txnInfo.getHash)
    output(7) = UTF8String.fromString(txnInfo.getInput)
    output(8) = UTF8String.fromString(txnInfo.getNonce.toString)
    output(9) = UTF8String.fromString(txnInfo.getPublicKey)
    output(10) = UTF8String.fromString(txnInfo.getR)
    output(11) = UTF8String.fromString(txnInfo.getRaw)
    output(12) = UTF8String.fromString(txnInfo.getS)
    output(13) = UTF8String.fromString(txnInfo.getTo)
    output(14) = UTF8String.fromString(txnInfo.getTransactionIndex.toString)
    output(15) = UTF8String.fromString(String.valueOf(txnInfo.getV))
    output(16) = UTF8String.fromString(txnInfo.getValue.toString)
    new GenericArrayData(output)
  }

  override def deserialize(datum: Any): TransactionType = {
    datum match {
      case values: ArrayData =>
        if(values.getUTF8String(0) != null) values.getUTF8String(0).toString else null
        val trn = new Transaction(if(values.getUTF8String(0) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(1) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(2) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(3) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(4) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(5) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(6) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(7) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(8) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(9) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(10) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(11) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(12) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(13) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(14) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(15) != null) values.getUTF8String(0).toString else null,
          if(values.getUTF8String(15) != null) values.getUTF8String(16).toString.toInt else 0
        )
        /*values.getUTF8String(1).toString
        values.getUTF8String(2).toString
        values.getUTF8String(3).toString
        values.getUTF8String(4).toString
        values.getUTF8String(5).toString
        values.getUTF8String(6).toString
        values.getUTF8String(7).toString
        values.getUTF8String(8).toString
        values.getUTF8String(9).toString
        values.getUTF8String(10).toString
        values.getUTF8String(11).toString
        values.getUTF8String(12).toString
        values.getUTF8String(13).toString
        values.getUTF8String(14).toString
        values.getUTF8String(15).toString
        values.getUTF8String(16).toString.toInt
        val trn = new Transaction(values.getUTF8String(0).toString,
          values.getUTF8String(1).toString,
          values.getUTF8String(2).toString,
          values.getUTF8String(3).toString,
          values.getUTF8String(4).toString,
          values.getUTF8String(5).toString,
          values.getUTF8String(6).toString,
          values.getUTF8String(7).toString,
          values.getUTF8String(8).toString,
          values.getUTF8String(9).toString,
          values.getUTF8String(10).toString,
          values.getUTF8String(11).toString,
          values.getUTF8String(12).toString,
          values.getUTF8String(13).toString,
          values.getUTF8String(14).toString,
          values.getUTF8String(15).toString,
          values.getUTF8String(16).toString.toInt)
          */
        new TransactionType(trn)
    }
  }

  override def userClass: Class[TransactionType] = classOf[TransactionType]

  private[spark] override def asNullable: TransactionUTD = this
}

case object TransactionUTD extends TransactionUTD