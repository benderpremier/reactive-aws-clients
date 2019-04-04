// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class AutoScalingPolicyUpdateBuilderOps(val self: AutoScalingPolicyUpdate.Builder) extends AnyVal {

  final def withPolicyNameAsScala(value: Option[String]): AutoScalingPolicyUpdate.Builder = {
    value.fold(self) { v =>
      self.policyName(v)
    }
  } // String

  final def withTargetTrackingScalingPolicyConfigurationAsScala(
      value: Option[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate]
  ): AutoScalingPolicyUpdate.Builder = {
    value.fold(self) { v =>
      self.targetTrackingScalingPolicyConfiguration(v)
    }
  } // AutoScalingTargetTrackingScalingPolicyConfigurationUpdate

}

final class AutoScalingPolicyUpdateOps(val self: AutoScalingPolicyUpdate) extends AnyVal {

  final def policyNameAsScala: Option[String] = Option(self.policyName) // String

  final def targetTrackingScalingPolicyConfigurationAsScala
    : Option[AutoScalingTargetTrackingScalingPolicyConfigurationUpdate] =
    Option(self.targetTrackingScalingPolicyConfiguration) // AutoScalingTargetTrackingScalingPolicyConfigurationUpdate

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAutoScalingPolicyUpdateOps {

  implicit def toAutoScalingPolicyUpdateBuilderOps(
      v: AutoScalingPolicyUpdate.Builder
  ): AutoScalingPolicyUpdateBuilderOps = new AutoScalingPolicyUpdateBuilderOps(v)

  implicit def toAutoScalingPolicyUpdateOps(v: AutoScalingPolicyUpdate): AutoScalingPolicyUpdateOps =
    new AutoScalingPolicyUpdateOps(v)

}