package project1b;


import java.util.*;
class Module implements Comparable<Module>{
	private String title;
	private String lecturer;
	private int hours;
	Module(String t, String l, int h){
		title = t; lecturer = l; hours = h;
		}
	public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLecturer() {
        return this.lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean equals(Module m) {
        if(title ==  m.title && lecturer == m.lecturer && hours == m.hours) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return title + lecturer + hours;
    }

    public int hashCode() {
        return toString().hashCode();
    }

	public int compareTo(Module m){
		return (this.hours - m.hours);
		}

	public static Comparator<Module> lectCompare = new Comparator<Module>() {
		public int compare(Module m1, Module m2) {
			return m1.lecturer.compareTo(m2.lecturer);
			}
		};
}
