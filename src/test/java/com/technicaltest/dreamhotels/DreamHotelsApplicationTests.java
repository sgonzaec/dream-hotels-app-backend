package com.technicaltest.dreamhotels;

import com.technicaltest.dreamhotels.domain.Hotel;
import com.technicaltest.dreamhotels.service.IHotelService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DreamHotelsApplicationTests {

	//1. Aplicamos Autowired y referenciamos a nuestro IProductRepository
	@Autowired(required=true)
	private IHotelService iHotelService;
	@Test
	void contextLoads() {
	}

	//2. Creamos un metodo de tipo @Test y de nombre contextInsert
	@Test
	void testInsert() {
		//3. Invocar nuestro constructor
		Hotel hotel = new Hotel();

		//4. Asignamos valores...
		hotel.setName("aviaturH");

		//5. Finalidad invocamos al método insertHotel
		iHotelService.insertHotel(hotel);
	}

}
