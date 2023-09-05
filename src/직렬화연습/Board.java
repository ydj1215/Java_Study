package 직렬화연습;

import java.io.Serializable; // 직렬화가 가능하다.
import java.util.Date;

public class Board implements Serializable {
    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date date;

    public Board(int bno, String title, String content, String writer, Date date) {
        this.bno = bno;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.date = date;
    }

    public int getBno() {
        return bno;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getWriter() {
        return writer;
    }

    public Date getDate() {
        return date;
    }

}
