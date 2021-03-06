package graphdb.extractors.parsers.stackoverflow.entity;

import graphdb.extractors.parsers.stackoverflow.StackOverflowExtractor;
import org.neo4j.graphdb.Label;
import org.neo4j.graphdb.Node;

public class QaCommentInfo {

    Node node = null;
    int commentId = 0;
    int parentId = 0;
    int userId = -1;

    public QaCommentInfo(Node node, int id, int parentId, int score, String text, String creationDate, int userId) {
        this.node = node;
        this.commentId = id;
        this.parentId = parentId;
        this.userId = userId;

        node.addLabel(Label.label(StackOverflowExtractor.COMMENT));

        node.setProperty(StackOverflowExtractor.COMMENT_ID, id);
        node.setProperty(StackOverflowExtractor.COMMENT_PARENT_ID, parentId);
        node.setProperty(StackOverflowExtractor.COMMENT_SCORE, score);
        node.setProperty(StackOverflowExtractor.COMMENT_TEXT, text);
        node.setProperty(StackOverflowExtractor.COMMENT_CREATION_DATE, creationDate);
        node.setProperty(StackOverflowExtractor.COMMENT_USER_ID, userId);

    }

    public int getCommentId() {
        return commentId;
    }

    public int getParentId() {
        return parentId;
    }

    public int getUserId() {
        return userId;
    }

    public Node getNode() {
        return node;
    }
}
