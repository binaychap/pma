package org.pma.config;



public class DataSourceConfig {

//	@Value("${spring.data.mongodb.host}")
//	private String host;
//	@Value("${spring.data.mongodb.database}")
//	private String database;
//	@Value("${spring.data.mongodb.port}")
//	private Integer port;
//
//	@Bean(name = "mongoTemplate")
//	@Profile("development")
//	public MongoTemplate development() {
//		return getMongoTemplate();
//	}
//
//	@Bean(name = "mongoTemplate")
//	@Profile("production")
//	public MongoTemplate production() {
//		return getMongoTemplate();
//	}
//
//	/*
//	 * Method that creates MongoDbFactory Common to both of the MongoDb connections
//	 */
//	public MongoDbFactory mongoDbFactory() {
//		return new SimpleMongoDbFactory(getMongoClient(), database);
//	}
//
//	/*
//	 * Method that creates MongoClient
//	 */
//	private MongoClient getMongoClient() {
//		return new MongoClient(host, port);
//	}
//
//	MongoTemplate getMongoTemplate() {
//		return new MongoTemplate(mongoDbFactory());
//	}
}
