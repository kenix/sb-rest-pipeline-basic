package com.example.web

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

/**
 * @author zzhao
 */
@WebMvcTest
class GreetingsControllerSpec extends Specification {

  @Autowired
  MockMvc mockMvc

  def 'web application context'() {
    when:
    def result = this.mockMvc
        .perform(get("/hi"))
        .andDo(print())
        .andExpect(status().isOk())
        .andReturn()
    then:
    result.response.contentAsString == 'hello'
  }
}
