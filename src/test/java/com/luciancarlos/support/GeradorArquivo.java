package com.luciancarlos.support;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class GeradorArquivo {
	public static String dataHoraParaArquivo() {
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		return new SimpleDateFormat("yyyyMMdd-HH-mm-ss").format(ts);		
	}
}
