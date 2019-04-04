// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class EnhancedMetricsBuilderOps(val self: EnhancedMetrics.Builder) extends AnyVal {

  final def withShardLevelMetricsAsScala(value: Option[Seq[MetricsName]]): EnhancedMetrics.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.shardLevelMetrics(v.asJava)
    } // Seq[String]
  }

}

final class EnhancedMetricsOps(val self: EnhancedMetrics) extends AnyVal {

  final def shardLevelMetricsAsScala: Option[Seq[MetricsName]] = Option(self.shardLevelMetrics).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[String]

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToEnhancedMetricsOps {

  implicit def toEnhancedMetricsBuilderOps(v: EnhancedMetrics.Builder): EnhancedMetricsBuilderOps =
    new EnhancedMetricsBuilderOps(v)

  implicit def toEnhancedMetricsOps(v: EnhancedMetrics): EnhancedMetricsOps = new EnhancedMetricsOps(v)

}