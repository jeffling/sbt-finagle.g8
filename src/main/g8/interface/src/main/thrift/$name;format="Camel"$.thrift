struct Comment {
	1: string author,
	2: string body,
	3: i32 date,
}

struct Conversation {
	1: string id,
	2: list<Comment> comments
}

service $name;format="Camel"$ {
	string postNewConversation(1: required string attachedTo, 2: required Comment comment),
	bool postToConversation(1: required string conversationID, 2: required Comment comment),
	list<Conversation> getAll(1: required string attachedTo),
	Conversation getConversation(1: string conversationID),
	string getConversationParent(1: string conversationID)
}