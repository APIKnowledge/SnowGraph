package graphdb.extractors.parsers.stackoverflow.entity;

import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;

import graphdb.extractors.parsers.stackoverflow.StackOverflowExtractor;

public class QuestionInfo {

    Node node = null;
    int questionId = 0;
    int acceptedAnswerId = -1;
    int ownerUserId = -1;


    public QuestionInfo(Node node, int id, String creationDate, int score, int viewCount, String body, int ownerUserId, String title, String tags, int acceptedAnswerId) {
        this.node = node;
        this.questionId = id;
        this.acceptedAnswerId = acceptedAnswerId;
        this.ownerUserId = ownerUserId;

        node.addLabel(Label.label(StackOverflowExtractor.QUESTION));

        node.setProperty(StackOverflowExtractor.QUESTION_ID, id);
        node.setProperty(StackOverflowExtractor.QUESTION_CREATION_DATE, creationDate);
        node.setProperty(StackOverflowExtractor.QUESTION_SCORE, score);
        node.setProperty(StackOverflowExtractor.QUESTION_VIEW_COUNT, viewCount);
        node.setProperty(StackOverflowExtractor.QUESTION_BODY, body);
        node.setProperty(StackOverflowExtractor.QUESTION_OWNER_USER_ID, ownerUserId);
        node.setProperty(StackOverflowExtractor.QUESTION_TITLE, title);
        node.setProperty(StackOverflowExtractor.QUESTION_TAGS, tags);

    }

    public int getQuestionId() {
        return questionId;
    }

    public int getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    public int getOwnerUserId() {
        return ownerUserId;
    }

    public Node getNode() {
        return node;
    }
}
