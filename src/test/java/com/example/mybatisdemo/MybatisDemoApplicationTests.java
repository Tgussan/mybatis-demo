package com.example.mybatisdemo;

import static org.hamcrest.CoreMatchers.containsString;

import org.junit.ClassRule;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.rule.OutputCapture;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class MybatisDemoApplicationTests {

	@ClassRule
    public static OutputCapture out = new OutputCapture(); // System.outの内容をキャプチャする
	@Test
	void contextLoads() {
		// System.outした内容を検証する
        out.expect(containsString("ID       : 1"));
        out.expect(containsString("TITLE    : 飲み会"));
        out.expect(containsString("DETAILS  : 銀座 19:00"));
        out.expect(containsString("FINISHED : false"));
	}

}
