// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class AccessControlTranslationBuilderOps(val self: AccessControlTranslation.Builder) extends AnyVal {

  final def withOwnerAsScala(value: Option[OwnerOverride]): AccessControlTranslation.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  } // String

}

final class AccessControlTranslationOps(val self: AccessControlTranslation) extends AnyVal {

  final def ownerAsScala: Option[OwnerOverride] = Option(self.owner) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccessControlTranslationOps {

  implicit def toAccessControlTranslationBuilderOps(
      v: AccessControlTranslation.Builder
  ): AccessControlTranslationBuilderOps = new AccessControlTranslationBuilderOps(v)

  implicit def toAccessControlTranslationOps(v: AccessControlTranslation): AccessControlTranslationOps =
    new AccessControlTranslationOps(v)

}