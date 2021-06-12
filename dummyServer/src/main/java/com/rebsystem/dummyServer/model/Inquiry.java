package com.rebsystem.dummyServer.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inquiry {

	/**
	 *  氏名（必須, 文字列, 文字数制限60文字）
	 */
	@NotBlank
	@Size(max=60)
	private String name;

	/**
	 *  E-Mail（必須, E-Mail形式, 文字数制限254文字）
	 */
	@NotBlank
	@Email
	@Size(max=254)
	private String email;

	/**
	 * お問合せ（必須, 文字列, 文字数制限500文字）
	 */
	private String inquiry;
}
