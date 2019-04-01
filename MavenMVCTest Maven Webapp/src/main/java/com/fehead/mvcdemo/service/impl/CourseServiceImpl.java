package com.fehead.mvcdemo.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.fehead.mvcdemo.model.Course;
import com.fehead.mvcdemo.service.CourseService;
import com.fehead.mvcdemo.model.Chapter;

public class CourseServiceImpl implements CourseService {

public Course getCoursebyId(Integer courseId) {
		
		Course course = new Course();
		
		course.setCourseId(courseId);
		course.setTitle("����ǳ��Java���߳�");
		
		course.setLearningNum(12345);
		course.setLevel(2);
		course.setLevelDesc("�м�");
		course.setDuration(7200l);
		course.setDescr("���߳����ճ������еĳ���֪ʶ");
		
		List<Chapter> chapterList = new ArrayList<Chapter>();
		
		warpChapterList(courseId,chapterList);
		
		course.setChapterList(chapterList);
		
		return course;
	}

	private void warpChapterList(Integer courseId,List<Chapter> chapterList) {
		Chapter chapter = new Chapter();
		chapter.setId(1);
		chapter.setCourseId(courseId);
		chapter.setOrder(1);
		chapter.setTitle("1.��������");
		chapter.setDescr("���ܱ���");	
		chapterList.add(chapter);
		
		chapter = new Chapter();
		chapter.setId(2);
		chapter.setCourseId(courseId);
		chapter.setOrder(2);
		chapter.setTitle("2.������");
		chapter.setDescr("�˽����");
		chapterList.add(chapter);
		
		

	}
	
}
