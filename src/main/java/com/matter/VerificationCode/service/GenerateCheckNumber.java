package com.matter.VerificationCode.service;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionContext;

/** 
 * @author  Administrator: 
 * @version 创建时间：2016-8-5 下午11:17:47 
 * 类说明 
 */
@ParentPackage("basePackage")
@Action(value="loginChkNumber",results={@Result(type="json",params = {"contentType","image/jpeg"})})//使用convention-plugin插件提供的@Action注解将一个普通java类标注为一个可以处理用户请求的Action，Action的名字为struts2Test
@Namespace("/")//使用convention-plugin插件提供的@Namespace注解为这个Action指定一个命名空间
public class GenerateCheckNumber {

	/** 
	 * 获取验证码 
	 */  
	public ByteArrayInputStream  getChkNumber(){  
	     int width = 85, height = 25;    
	        BufferedImage image = new  BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);    
	        Graphics g = image.getGraphics();    
	        Random random = new Random();    
	        g.setColor(getRandColor(200, 255));    
	        g.fillRect(0, 0, width, height);    
	            
	        g.setFont(new Font("Times New Roman", Font.PLAIN, 18));    
	        g.setColor(getRandColor(160, 200));    
	        for(int i = 0; i < 155; i++)    
	        {    
	            int x1 = random.nextInt(width);    
	            int y1 = random.nextInt(height);    
	            int x2 = random.nextInt(12);    
	            int y2 = random.nextInt(12);    
	            g.drawLine(x1, y1, x2, y2);    
	        }    
	            
	        String sRand = "";    
	        for(int i = 0; i < 6; i++)    
	        {    
	            String rand = getRandomChar();    
	            sRand += rand;    
	            g.setColor(new Color(20 + random.nextInt(110), 20 + random.nextInt(110), 20 + random.nextInt(110)));    
	            g.drawString(rand, 13*i+6, 16);    
	        }  
	        //存进session,用于验证    
	        ActionContext.getContext().getSession().put("randomImg", sRand.toLowerCase());  
	        g.dispose();    
	        ByteArrayOutputStream output = new ByteArrayOutputStream();    
	        ImageOutputStream imageOut;  
	        try {  
	            imageOut = ImageIO.createImageOutputStream(output);  
	            ImageIO.write(image, "JPEG", imageOut);    
	            imageOut.close();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }    
	        ByteArrayInputStream input = new ByteArrayInputStream(output.toByteArray());  
	        return input;  
	  }  
	  
	//颜色  
	public Color getRandColor(int fc, int bc){  
	    Random random = new Random();    
	    if(fc > 255) fc = 255;    
	    if(bc > 255) bc = 255;    
	    int r = fc + random.nextInt(bc - fc);    
	    int g = fc + random.nextInt(bc - fc);    
	    int b = fc + random.nextInt(bc - fc);    
	    return new Color(r, g, b);  
	}  
	  
	//产生随机数  
	public String getRandomChar(){  
	    int rand = (int)Math.round(Math.random() * 2);    
	    long itmp = 0;    
	    char ctmp = '\u0000';    
	    switch (rand)    
	    {    
	         case 1:    
	              itmp = Math.round(Math.random() * 25 + 65);    
	              ctmp = (char)itmp;    
	              return String.valueOf(ctmp);    
	         case 2:    
	              itmp = Math.round(Math.random() * 25 + 97);    
	              ctmp = (char)itmp;    
	              return String.valueOf(ctmp);    
	         default :    
	              itmp = Math.round(Math.random() * 9);    
	              
	    }    
	    return String.valueOf(itmp);    
	}  
}
