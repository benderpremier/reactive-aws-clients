// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GetBucketAccelerateConfigurationRequestBuilderOps(val self: GetBucketAccelerateConfigurationRequest.Builder)
    extends AnyVal {

  final def withBucketAsScala(value: Option[String]): GetBucketAccelerateConfigurationRequest.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

}

final class GetBucketAccelerateConfigurationRequestOps(val self: GetBucketAccelerateConfigurationRequest)
    extends AnyVal {

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetBucketAccelerateConfigurationRequestOps {

  implicit def toGetBucketAccelerateConfigurationRequestBuilderOps(
      v: GetBucketAccelerateConfigurationRequest.Builder
  ): GetBucketAccelerateConfigurationRequestBuilderOps = new GetBucketAccelerateConfigurationRequestBuilderOps(v)

  implicit def toGetBucketAccelerateConfigurationRequestOps(
      v: GetBucketAccelerateConfigurationRequest
  ): GetBucketAccelerateConfigurationRequestOps = new GetBucketAccelerateConfigurationRequestOps(v)

}