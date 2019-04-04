// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class ListPartsResponseBuilderOps(val self: ListPartsResponse.Builder) extends AnyVal {

  final def withAbortDateAsScala(value: Option[java.time.Instant]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.abortDate(v)
    }
  } // Instant

  final def withAbortRuleIdAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.abortRuleId(v)
    }
  } // String

  final def withBucketAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.bucket(v)
    }
  } // String

  final def withKeyAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  } // String

  final def withUploadIdAsScala(value: Option[String]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.uploadId(v)
    }
  } // String

  final def withPartNumberMarkerAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.partNumberMarker(v)
    }
  } // Int

  final def withNextPartNumberMarkerAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.nextPartNumberMarker(v)
    }
  } // Int

  final def withMaxPartsAsScala(value: Option[Int]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.maxParts(v)
    }
  } // Int

  final def withIsTruncatedAsScala(value: Option[Boolean]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.isTruncated(v)
    }
  } // Boolean

  final def withPartsAsScala(value: Option[Seq[Part]]): ListPartsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.parts(v.asJava)
    } // Seq[Part]
  }

  final def withInitiatorAsScala(value: Option[Initiator]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.initiator(v)
    }
  } // Initiator

  final def withOwnerAsScala(value: Option[Owner]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.owner(v)
    }
  } // Owner

  final def withStorageClassAsScala(value: Option[StorageClass]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.storageClass(v)
    }
  } // String

  final def withRequestChargedAsScala(value: Option[RequestCharged]): ListPartsResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // String

}

final class ListPartsResponseOps(val self: ListPartsResponse) extends AnyVal {

  final def abortDateAsScala: Option[java.time.Instant] = Option(self.abortDate) // Instant

  final def abortRuleIdAsScala: Option[String] = Option(self.abortRuleId) // String

  final def bucketAsScala: Option[String] = Option(self.bucket) // String

  final def keyAsScala: Option[String] = Option(self.key) // String

  final def uploadIdAsScala: Option[String] = Option(self.uploadId) // String

  final def partNumberMarkerAsScala: Option[Int] = Option(self.partNumberMarker) // Int

  final def nextPartNumberMarkerAsScala: Option[Int] = Option(self.nextPartNumberMarker) // Int

  final def maxPartsAsScala: Option[Int] = Option(self.maxParts) // Int

  final def isTruncatedAsScala: Option[Boolean] = Option(self.isTruncated) // Boolean

  final def partsAsScala: Option[Seq[Part]] = Option(self.parts).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[Part]

  final def initiatorAsScala: Option[Initiator] = Option(self.initiator) // Initiator

  final def ownerAsScala: Option[Owner] = Option(self.owner) // Owner

  final def storageClassAsScala: Option[StorageClass] = Option(self.storageClass) // String

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPartsResponseOps {

  implicit def toListPartsResponseBuilderOps(v: ListPartsResponse.Builder): ListPartsResponseBuilderOps =
    new ListPartsResponseBuilderOps(v)

  implicit def toListPartsResponseOps(v: ListPartsResponse): ListPartsResponseOps = new ListPartsResponseOps(v)

}