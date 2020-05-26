package com.test.emailbatch.beans;

import java.util.Date;

public class LendingBean {

    private Long   id;

    private Date reservationDate;

    private boolean extension;

    private boolean bookReturn;

    private boolean tag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public boolean isExtension() {
        return extension;
    }

    public void setExtension(boolean extension) {
        this.extension = extension;
    }

    public boolean isBookReturn() {
        return bookReturn;
    }

    public void setBookReturn(boolean bookReturn) {
        this.bookReturn = bookReturn;
    }

    public boolean isTag() {
        return tag;
    }

    public void setTag(boolean tag) {
        this.tag = tag;
    }
}
