package com.technicaltest.dreamhotels;

import com.technicaltest.dreamhotels.domain.entity.Hotel;
import com.technicaltest.dreamhotels.service.interfaces.IHotelService;
import com.technicaltest.dreamhotels.service.mapper.HotelMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DreamHotelsApplicationTests {

	//1. Aplicamos Autowired y referenciamos a nuestro IProductRepository
	@Autowired(required=true)
	private IHotelService iHotelService;
	@Autowired
	HotelMapper hotelMapper;

	@Test
	void contextLoads() {
	}

	//2. Creamos un metodo de tipo @Test y de nombre contextInsert
	@Test
	void testInsertHotel() {

		//3. Invocar nuestro constructor
		Hotel hotel = new Hotel();

		//4. Asignamos valores...
		hotel.setName("Dan Carlton");

		//5. Finalidad invocamos al método insertHotel
		iHotelService.insertHotel(hotelMapper.convertToDTO(hotel));
	}

}
