// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class ReplaceRouteRequestBuilderOps(val self: ReplaceRouteRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala(value: Option[String]): ReplaceRouteRequest.Builder = {
    value.fold(self) { v =>
      self.destinationCidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationIpv6CidrBlockAsScala(value: Option[String]): ReplaceRouteRequest.Builder = {
    value.fold(self) { v =>
      self.destinationIpv6CidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressOnlyInternetGatewayIdAsScala(value: Option[String]): ReplaceRouteRequest.Builder = {
    value.fold(self) { v =>
      self.egressOnlyInternetGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def gatewayIdAsScala(value: Option[String]): ReplaceRouteRequest.Builder = {
    value.fold(self) { v =>
      self.gatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala(value: Option[String]): ReplaceRouteRequest.Builder = {
    value.fold(self) { v =>
      self.instanceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def natGatewayIdAsScala(value: Option[String]): ReplaceRouteRequest.Builder = {
    value.fold(self) { v =>
      self.natGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala(value: Option[String]): ReplaceRouteRequest.Builder = {
    value.fold(self) { v =>
      self.transitGatewayId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala(value: Option[String]): ReplaceRouteRequest.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeTableIdAsScala(value: Option[String]): ReplaceRouteRequest.Builder = {
    value.fold(self) { v =>
      self.routeTableId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionIdAsScala(value: Option[String]): ReplaceRouteRequest.Builder = {
    value.fold(self) { v =>
      self.vpcPeeringConnectionId(v)
    }
  }

}

final class ReplaceRouteRequestOps(val self: ReplaceRouteRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationCidrBlockAsScala: Option[String] = Option(self.destinationCidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def destinationIpv6CidrBlockAsScala: Option[String] = Option(self.destinationIpv6CidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def egressOnlyInternetGatewayIdAsScala: Option[String] = Option(self.egressOnlyInternetGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def gatewayIdAsScala: Option[String] = Option(self.gatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def instanceIdAsScala: Option[String] = Option(self.instanceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def natGatewayIdAsScala: Option[String] = Option(self.natGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transitGatewayIdAsScala: Option[String] = Option(self.transitGatewayId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def routeTableIdAsScala: Option[String] = Option(self.routeTableId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def vpcPeeringConnectionIdAsScala: Option[String] = Option(self.vpcPeeringConnectionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToReplaceRouteRequestOps {

  implicit def toReplaceRouteRequestBuilderOps(v: ReplaceRouteRequest.Builder): ReplaceRouteRequestBuilderOps =
    new ReplaceRouteRequestBuilderOps(v)

  implicit def toReplaceRouteRequestOps(v: ReplaceRouteRequest): ReplaceRouteRequestOps = new ReplaceRouteRequestOps(v)

}
