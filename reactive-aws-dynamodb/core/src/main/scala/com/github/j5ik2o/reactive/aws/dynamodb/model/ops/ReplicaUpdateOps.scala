// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ReplicaUpdateBuilderOps(val self: ReplicaUpdate.Builder) extends AnyVal {

  final def withCreateAsScala(value: Option[CreateReplicaAction]): ReplicaUpdate.Builder = {
    value.fold(self) { v =>
      self.create(v)
    }
  } // CreateReplicaAction

  final def withDeleteAsScala(value: Option[DeleteReplicaAction]): ReplicaUpdate.Builder = {
    value.fold(self) { v =>
      self.delete(v)
    }
  } // DeleteReplicaAction

}

final class ReplicaUpdateOps(val self: ReplicaUpdate) extends AnyVal {

  final def createAsScala: Option[CreateReplicaAction] = Option(self.create) // CreateReplicaAction

  final def deleteAsScala: Option[DeleteReplicaAction] = Option(self.delete) // DeleteReplicaAction

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplicaUpdateOps {

  implicit def toReplicaUpdateBuilderOps(v: ReplicaUpdate.Builder): ReplicaUpdateBuilderOps =
    new ReplicaUpdateBuilderOps(v)

  implicit def toReplicaUpdateOps(v: ReplicaUpdate): ReplicaUpdateOps = new ReplicaUpdateOps(v)

}