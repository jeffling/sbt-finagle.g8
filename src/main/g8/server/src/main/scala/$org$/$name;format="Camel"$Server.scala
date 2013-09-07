package $org$

import org.apache.thrift.protocol.TBinaryProtocol
import com.twitter.finagle.builder.ServerBuilder
import com.twitter.finagle.thrift.ThriftServerFramedCodec

object $name;format="Camel"$Server extends App {
	val protocol = new TBinaryProtocol.Factory()
	val serverService = new thrift.$name;format="Camel"$.FinagledService(new $name;format="Camel"$Service, protocol)
	val address = new java.net.InetSocketAddress(9000)
	var builder = ServerBuilder()
	  .codec(ThriftServerFramedCodec())
	  .name("$name;format="normalize"$")
	  .bindTo(address)
	  .build(serverService)
}