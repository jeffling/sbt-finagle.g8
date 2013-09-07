import sbt._
import Keys._

object $name;format="Camel"$Build extends Build {
    lazy val root = Project(id = "$name;format="normalize"$",
                            base = file(".")) aggregate(interface, server)

    // the thrift interface finagle/scrooge generates from thrift files. 
    lazy val interface = Project(id = "interface",
                           base = file("interface"))

    // the server that the thrift interface interfaces with
    lazy val server = Project(id = "server",
                           base = file("server")) dependsOn interface
}