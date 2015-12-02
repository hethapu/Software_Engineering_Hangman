hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
	cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
	singleSession = true // configure OSIV singleSession mode
//	dialect = "org.hibernate.dialect.H2Dialect"
}


environments {
	development {
		dataSource {
		    pooled = true
		    jmxExport = true
		    driverClassName = "org.h2.Driver"
		    username = "sa"
		    password = ""
		    dbCreate = "create" // one of 'create', 'create-drop', 'update', 'validate', ''
		    url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000;DB_CLOSE_ON_EXIT=FALSE"
			}
		}
	
		
	production {
		dataSource {
			pooled = true
			dbCreate = "update"
			driverClassName = "com.mysql.jdbc.Driver"
			username = "hangmandb"
			password = "codeexec"
			url = "jdbc:mysql://aa1848dgl3y268c.cjigcqzkeymw.us-west-2.rds.amazonaws.com:3306/ebdb?user=hangmandb&password=codeexec"
			dialect = org.hibernate.dialect.MySQL5InnoDBDialect
			properties {
				validationQuery = "SELECT 1"
				testOnBorrow = true
				testOnReturn = true
				testWhileIdle = true
				timeBetweenEvictionRunsMillis = 1000 * 60 * 30
				numTestsPerEvictionRun = 3
				minEvictableIdleTimeMillis = 1000 * 60 * 30
			}
		}
	}
}

