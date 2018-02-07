package com.yanzi.bean;

public class Course {
	private Integer courseId;
	private String title;
	private String enTitle;
	private String image;
	private int valid;
	public Integer getCourseId() {
		return courseId;
	}
	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEnTitle() {
		return enTitle;
	}
	public void setEnTitle(String enTitle) {
		this.enTitle = enTitle;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getValid() {
		return valid;
	}
	public void setValid(int valid) {
		this.valid = valid;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", enTitle=" + enTitle + ", image=" + image
				+ ", valid=" + valid + "]";
	}
	
	
	
}
