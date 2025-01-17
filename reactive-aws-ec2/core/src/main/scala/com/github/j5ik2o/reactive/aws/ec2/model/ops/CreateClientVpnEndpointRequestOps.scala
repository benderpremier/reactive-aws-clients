// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class CreateClientVpnEndpointRequestBuilderOps(val self: CreateClientVpnEndpointRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientCidrBlockAsScala(value: Option[String]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.clientCidrBlock(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverCertificateArnAsScala(value: Option[String]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.serverCertificateArn(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authenticationOptionsAsScala(
      value: Option[Seq[ClientVpnAuthenticationRequest]]
  ): CreateClientVpnEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.authenticationOptions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionLogOptionsAsScala(value: Option[ConnectionLogOptions]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.connectionLogOptions(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsServersAsScala(value: Option[Seq[String]]): CreateClientVpnEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dnsServers(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transportProtocolAsScala(value: Option[TransportProtocol]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.transportProtocol(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala(value: Option[String]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala(value: Option[String]): CreateClientVpnEndpointRequest.Builder = {
    value.fold(self) { v =>
      self.clientToken(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala(value: Option[Seq[TagSpecification]]): CreateClientVpnEndpointRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tagSpecifications(v.asJava)
    }
  }

}

final class CreateClientVpnEndpointRequestOps(val self: CreateClientVpnEndpointRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientCidrBlockAsScala: Option[String] = Option(self.clientCidrBlock)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def serverCertificateArnAsScala: Option[String] = Option(self.serverCertificateArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def authenticationOptionsAsScala: Option[Seq[ClientVpnAuthenticationRequest]] =
    Option(self.authenticationOptions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def connectionLogOptionsAsScala: Option[ConnectionLogOptions] = Option(self.connectionLogOptions)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dnsServersAsScala: Option[Seq[String]] = Option(self.dnsServers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def transportProtocolAsScala: Option[TransportProtocol] = Option(self.transportProtocol)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def descriptionAsScala: Option[String] = Option(self.description)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clientTokenAsScala: Option[String] = Option(self.clientToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagSpecificationsAsScala: Option[Seq[TagSpecification]] = Option(self.tagSpecifications).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateClientVpnEndpointRequestOps {

  implicit def toCreateClientVpnEndpointRequestBuilderOps(
      v: CreateClientVpnEndpointRequest.Builder
  ): CreateClientVpnEndpointRequestBuilderOps = new CreateClientVpnEndpointRequestBuilderOps(v)

  implicit def toCreateClientVpnEndpointRequestOps(
      v: CreateClientVpnEndpointRequest
  ): CreateClientVpnEndpointRequestOps = new CreateClientVpnEndpointRequestOps(v)

}
