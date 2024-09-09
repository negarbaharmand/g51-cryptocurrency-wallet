package se.lexicon;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.config.AppConfig;
import se.lexicon.model.Cryptocurrency;
import se.lexicon.model.Transaction;
import se.lexicon.model.Wallet;
import se.lexicon.service.TransactionManagement;
import se.lexicon.service.WalletManagement;

import java.math.BigDecimal;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //WalletDao walletDao = new WalletDaoImpl();
        //WalletManagement walletManagement = new WalletManagementImpl(walletDao);
        //Wallet wallet = walletManagement.create("my-first-wallet");
        //System.out.println(wallet);

        //TransactionDao transactionDao = new TransactionDaoImpl();
        //TransactionManagement transactionManagement = new TransactionManagementImpl(walletDao, transactionDao);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        WalletManagement walletManagement = context.getBean(WalletManagement.class);
        TransactionManagement transactionManagement = context.getBean(TransactionManagement.class);
        Wallet wallet = walletManagement.create("my-first-wallet");

        Transaction depositTransactionForBTC = transactionManagement.createDepositTransaction(
                wallet.getId(),
                Cryptocurrency.BTC,
                new BigDecimal(1),
                "Test deposit transaction");
        Transaction depositTransactionForETH = transactionManagement.createDepositTransaction(
                wallet.getId(),
                Cryptocurrency.ETH,
                new BigDecimal(10),
                "Test deposit transaction");
        System.out.println(walletManagement.getById(wallet.getId()));


    }
}
