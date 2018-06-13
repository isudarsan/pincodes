/**
 * 
 */
package org.asnworks.apis.pincodes.config;


import org.asnworks.apis.pincodes.constants.Constants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 * @author sudambat JPA Configuration
 */
@Configuration
@EnableJpaRepositories(Constants.JPA_REPOSITORIES)
public class JPAConfig {

    @Value("${db.username}")
    String userName;

    @Value("${db.password}")
    String password;

    @Value("${db.url}")
    String url;

    @Value("${db.driver}")
    String driver;

    @Value("${db.dialect}")
    String dialect;

    /**
     * @return DriverManagerDataSource
     */
    @Bean(name = "datasource")
    public DriverManagerDataSource getDriverManagerDataSource() {
        DriverManagerDataSource driverManagerDataSource =
            new DriverManagerDataSource();
        driverManagerDataSource.setUsername(userName);
        driverManagerDataSource.setPassword(password);
        driverManagerDataSource.setUrl(url);
        driverManagerDataSource.setDriverClassName(driver);
        return driverManagerDataSource;
    }

    /**
     * @return LocalContainerEntityManagerFactoryBean
     */
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean getLocalContainerEntityManagerFactoryBean() {
        LocalContainerEntityManagerFactoryBean emf =
            new LocalContainerEntityManagerFactoryBean();
        HibernateJpaVendorAdapter vendor =
            new HibernateJpaVendorAdapter();
        vendor.setShowSql(true);
        vendor.setDatabasePlatform(dialect);
        emf.setJpaVendorAdapter(vendor);
        emf.setDataSource(getDriverManagerDataSource());
        emf.setPackagesToScan(Constants.PACKAGE_SCAN_FOR_JPA_ENTITIES);
        return emf;
    }

}
