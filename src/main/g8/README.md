Compiling this app takes memory. To prevent a out of memory error, add the following line to your `~/.sbtconfig`.

	SBT_OPTS="-XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=512M"


The thrift API will need to be published so it can be used by Main-app.

	sbt interface/publish-local

You can publish to a repository (if your settings are correct in interface/build.sbt) with
	
	sbt interface/pubish

This service needs to run at the same time as Main-app in order for it to work.

	sbt server/run
