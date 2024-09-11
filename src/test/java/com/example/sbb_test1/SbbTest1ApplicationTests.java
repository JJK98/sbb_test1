package com.example.sbb_test1;

import com.example.sbb_test1.article.Article;
import com.example.sbb_test1.article.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class SbbTest1ApplicationTests {

	@Autowired
	private ArticleRepository articleRepository;

	@Test
	void testJpa() {
		Article a1 = new Article();
		a1.setTitle("sbb가 무엇인가요?");
		a1.setContent("sbb에 대해서 알고 싶습니다.");
		a1.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(a1);  // 첫번째 질문 저장

	}
}