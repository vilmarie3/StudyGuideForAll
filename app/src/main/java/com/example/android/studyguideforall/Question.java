/**
 * Created by vilmarietaraza on 3/19/18.
 */

package com.example.android.studyguideforall;


public class Question {


    public int location;
    public int question;
    public int photoId;
    public boolean isTrue;

    public void setLocation(int location) {
        this.location = location;
    }

    public int getLocation() {
        return location;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public void setQuestion(int question) {
        this.question = question;
    }

    public int getQuestion() {
        return question;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public Question(int location, int question, int photoId, boolean isTrue) {
        this.location = location;
        this.question = question;
        this.isTrue = isTrue;
        this.photoId = photoId;
    }

}
