package com.callor.ems.service.impl;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.callor.ems.model.EmsVO;
import com.callor.ems.model.UserVO;
import com.callor.ems.service.QualifyConfig;
import com.callor.ems.service.SendMailService;

import lombok.extern.slf4j.Slf4j;

@Service(QualifyConfig.SERVICE.MAIL_V1)
@Slf4j
public class SendMailServiceImplV1 implements SendMailService{

	/*
	 * 실질적으로 메일을 naver에 전송할 주체
	 */
	protected final JavaMailSender sender;

	public SendMailServiceImplV1(JavaMailSender sender) {
		this.sender = sender;

	}

	@Override
	public void sendMail(EmsVO emsVO) {
		
		//mail을 전송하기 전에 필수정보에 대해서 확인
		log.debug("받는사람 email : {}", emsVO.getE_to_email());
		log.debug("받는사람 이름 : {}", emsVO.getE_to_name());
		log.debug("제목 : {}", emsVO.getE_subject());

		//메일을 전송하기 위한 helper class 가져오기
		MimeMessage message = sender.createMimeMessage();
		// MimeMessage에게 속성을 설정하여 주입하기 위한 도구
		MimeMessageHelper mHelper = null;
		
		try {
			mHelper = new MimeMessageHelper(message, true, "UTF-8");
			mHelper.setFrom("mailhyuil@naver.com", emsVO.getE_from_name());
			String[] sendTo = {emsVO.getE_to_email()};
			mHelper.setTo(sendTo);
			mHelper.setSubject(emsVO.getE_subject());
			mHelper.setText(emsVO.getE_content());
			
			log.debug(mHelper.toString());
			//메일을 보낸다
			sender.send(message);
			log.debug("메일 전송 OK!!");
			
		} catch (MessagingException e) {
			log.debug("메시지 생성 오류");
		} catch (UnsupportedEncodingException e) {
			log.debug("메시지 변환 오류");
		}
		
		
		
		
		
	}

	@Override
	public void sendMail(EmsVO emsVO, UserVO userVO) {
		
	}
}
