<<<<<<< HEAD
package com.examly.springapp;

import static org.junit.Assert.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest(classes = SpringappApplication.class)
@AutoConfigureMockMvc
class SpringappApplicationTests {
	
	 @Autowired
	    private MockMvc mockMvc;

	@Test
    public void testGetVehicleAll() throws Exception {
    	
        mockMvc.perform(get("/admin/vehicle"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(print())
        .andExpect(content().contentType("application/json"))
			.andExpect(jsonPath("$").isArray())
			.andReturn();
    }
    
    @Test
    public void testGetVehicleById() throws Exception {
    	Long Id=1L;
    	
        mockMvc.perform(get("/admin/vehicle").param("id", "1"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(print())
        .andExpect(content().contentType("application/json"))
			.andExpect(jsonPath("$").isArray())
			.andReturn();
    }
    
    @Test
    public void testGetBookingAll() throws Exception {
    	
        mockMvc.perform(get("/user/booking"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(print())
        .andExpect(content().contentType("application/json"))
			.andExpect(jsonPath("$").isArray())
			.andReturn();
    }
    
    @Test
    public void testGetBookingById() throws Exception {
    	Long Id=1L;
    	
        mockMvc.perform(get("/user/booking").param("id", "1"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andDo(print())
        .andExpect(content().contentType("application/json"))
			.andExpect(jsonPath("$").isArray())
			.andReturn();
    }
    
 
    @Test
    public void test_case1() {
    String directoryPath = "src/main/java/com/examly/springapp/controller";
     File directory = new File(directoryPath);
     assertTrue(directory.exists() && directory.isDirectory());;
     }


   @Test
   public void test_case2() {
   String filePath = "src/main/java/com/examly/springapp/controller/BookingController.java";
   File file = new File(filePath);
   assertTrue(file.exists() && file.isFile());;

    }
   
   @Test
   public void test_case3() {
   String directoryPath = "src/main/java/com/examly/springapp/model";
    File directory = new File(directoryPath);
    assertTrue(directory.exists() && directory.isDirectory());;
    }


  @Test
  public void test_case4() {
  String filePath = "src/main/java/com/examly/springapp/model/Booking.java";
  File file = new File(filePath);
  assertTrue(file.exists() && file.isFile());;

   }

}
=======
package com.examly.springapp;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.junit.Test;
import org.junit.jupiter.api.Test; 
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@AutoConfigureMockMvc
@RunWith(SpringRunner.class)
class SpringappApplicationTests {

	@Autowired
    private MockMvc mockMvc;
	
	@Test
	@Transactional
    public void BE_Add_User() throws Exception {
        String newProduct = "{\"email\":\"test@gmail.com\",\"password\":\"Test@123\",\"username\":\"test123\",\"mobileNumber\":\"9876543210\",\"userRole\":\"user\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/signup")
		.contentType(MediaType.APPLICATION_JSON)
		.content(newProduct)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }

	@Test
	@Transactional
    public void BE_Add_Vehicle() throws Exception {
        String newVehicle = "{\"vehicleID\":\"01\",\"vehicleName\":\"ABC\",\"vehicleImageURL\":\"flight.com\",\"vehicleAddress\":\"chennai\",\"vehicleDescription\":\"safe ride\",\"vehicleAvailableStatus\":\"true\",\"price\":\"25000\"}";
        mockMvc.perform(MockMvcRequestBuilders.post("/admin/addProduct")
		.contentType(MediaType.APPLICATION_JSON)
		.content(newVehicle)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }
	
	@Test
	@Transactional
    public void BE_Get_Vehicle() throws Exception {
	 	mockMvc.perform(MockMvcRequestBuilders.get("/admin")
		.contentType(MediaType.APPLICATION_JSON)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andExpect(MockMvcResultMatchers.jsonPath("$").isNotEmpty())
		.andReturn();
    }

	@Test
	@Transactional
    public void BE_Update_Vehicle() throws Exception {
        String newVehicle = "{\"vehicleID\":\"01\",\"vehicleName\":\"ABC\",\"vehicleImageURL\":\"flight.com\",\"vehicleAddress\":\"chennai\",\"vehicleDescription\":\"safe ride\",\"vehicleAvailableStatus\":\"true\",\"price\":\"25000\"}";
        mockMvc.perform(MockMvcRequestBuilders.put("/admin/productEdit")
		.param("vehicleID","01")
		.contentType(MediaType.APPLICATION_JSON)
		.content(newVehicle)
		.accept(MediaType.APPLICATION_JSON))
		.andExpect(status().isOk())
		.andReturn();
    }
	
}
>>>>>>> 510b563e994730f1c1d54d772bd339e920081a14
