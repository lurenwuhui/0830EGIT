package com.demo.jedis.test;

import static org.junit.Assert.*;

import org.junit.Test;

import redis.clients.jedis.Jedis;

public class JedisTest {

	@Test
	public void test() {
		Jedis jedis = new Jedis("192.168.255.6", 6379,60000);
		String pong = jedis.ping();
		System.out.println(pong);
		System.out.println(pong);
		jedis.close();
	}

}
