package se.lexicon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "se.lexicon")
public class AppConfig {

//    @Bean
//    public TransactionDaoImpl transactionDao() {
//        return new TransactionDaoImpl();
//    }
//
//    @Bean
//    public WalletDaoImpl walletDao() {
//        return new WalletDaoImpl();
//    }
//
//    @Bean
//    public TransactionManagementImpl transactionManagement() {
//        return new TransactionManagementImpl(walletDao(), transactionDao());
//    }
//
//    @Bean
//    public WalletManagementImpl walletManagement() {
//        return new WalletManagementImpl(walletDao());
//    }
}
