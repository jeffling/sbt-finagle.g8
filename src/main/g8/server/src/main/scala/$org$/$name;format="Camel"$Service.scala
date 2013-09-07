package $org$

import com.twitter.util.Future

class $name;format="Camel"$Service extends thrift.$name;format="Camel"$.FutureIface {
	def postToConversation(conversationID: String, comment: thrift.Comment) = Future[Boolean] {
		???
	}

	def postNewConversation(attachedTo: String, comment: thrift.Comment) = Future[String] {
		???
	}

	def getAll(attachedTo: String) = Future[List[thrift.Conversation]] {
		???
	}

	def getConversation(conversationID: String) = Future[thrift.Conversation] {
		???
	}

	def getConversationParent(conversationID: String) = Future[String] {
		???
	}
}