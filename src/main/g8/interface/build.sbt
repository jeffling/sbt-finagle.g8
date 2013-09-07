name := "$name;format="Camel"$"

scalaVersion := "$scalaVersion$"

version := "0.0.1-SNAPSHOT"

com.twitter.scrooge.ScroogeSBT.newSettings

// publishTo <<= version { (v: String) =>
//   val nexus = "$repoUrl$"
//   if (v.trim.endsWith("SNAPSHOT"))
//     Some("snapshots" at nexus + "content/repositories/snapshots")
//   else
//     Some("releases"  at nexus + "content/repositories/releases")
// }

publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

libraryDependencies ++= Seq(
	"com.twitter" %% "finagle-thrift" % "6.4.0",
	"org.apache.thrift" % "libthrift" % "0.8.0",
	"com.twitter" %% "scrooge-runtime" % "3.2.1"
)