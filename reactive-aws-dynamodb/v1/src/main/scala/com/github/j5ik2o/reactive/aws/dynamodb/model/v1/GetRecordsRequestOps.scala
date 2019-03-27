// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v1

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ GetRecordsRequest => ScalaGetRecordsRequest, _ }
import com.amazonaws.services.dynamodbv2.model.{ GetRecordsRequest => JavaGetRecordsRequest }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object GetRecordsRequestOps {

  implicit class ScalaGetRecordsRequestOps(val self: ScalaGetRecordsRequest) extends AnyVal {

    def toJava: JavaGetRecordsRequest = {
      val result = new JavaGetRecordsRequest()
      self.shardIterator.filter(_.nonEmpty).foreach(v => result.withShardIterator(v)) // String
      self.limit.map(_.intValue).foreach(v => result.withLimit(v))                    // Int

      result
    }

  }

}
