package com.marina.Giorno2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Giorno2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Giorno2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}
}

/*

	Realizzare un servizio Spring Boot attivo sulla porta 8082 che espone i seguenti endpoint GET:
	/app/data1   -> response
	/app/data2 -> responselist di arraylist di 4 persone
	/app/data3 -> arraylist di 4 persone
	Realizzare un servizio Spring Boot attivo sulla porta 8081 che espone i seguenti endpoint:
	/os/get-string    contatta :8082/app/data1 e stampa il responso
	/os/get-people contatta :8082/app/data3 e stampa il responso
	/os/get-people-json contatta :8082/app/data3 e produci il responso JSON

	Opzionalmente, proteggere le route tramite autenticazione.
	Opzionalmente, agganciare un front-end tramite Live Server e contattare :8082/app/data3
	per stampare in console il risultato JSON (occorre abilitare il CORS sul back-end).

*/