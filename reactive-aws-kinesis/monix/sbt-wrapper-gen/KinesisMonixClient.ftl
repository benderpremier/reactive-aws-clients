// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.monix

import software.amazon.awssdk.services.kinesis.model._
import com.github.j5ik2o.reactive.aws.kinesis.{ KinesisAsyncClient, KinesisClient }
import monix.eval.Task
import monix.reactive.Observable

object KinesisMonixClient {

def apply(underlying: KinesisAsyncClient): KinesisMonixClient = new KinesisMonixClientImpl(underlying)

}

trait KinesisMonixClient extends KinesisClient[Task] {

val underlying: KinesisAsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <#assign requestParameterName=method.parameterTypeDescs[0].name>
        <#assign requestTypeName=method.parameterTypeDescs[0].parameterTypeDesc.simpleTypeName>
        <#if method.name?ends_with("Paginator")>
            <#assign responseTypeName=requestTypeName?replace("Request", "Response")>
            def ${method.name}(${requestParameterName}: ${requestTypeName}): Observable[${responseTypeName}] =
              Observable.fromReactivePublisher(underlying.${method.name}(${requestParameterName}))
        <#else>
            <#assign responseTypeName=method.returnTypeDesc.valueTypeDesc.simpleTypeName>
            override def  ${method.name}(${requestParameterName}: ${requestTypeName}): Task[${responseTypeName}] = Task.deferFuture {
              underlying.${method.name}(${requestParameterName})
            }
        </#if>
    </#if></#list>

}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name == "subscribeToShard">
        <#return false>
    </#if>
    <#if !methodDesc.parameterTypeDescs?has_content>
        <#return false>
    </#if>
    <#local target=true>
    <#list methodDesc.parameterTypeDescs as p>
        <#if p.parameterTypeDesc.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>
