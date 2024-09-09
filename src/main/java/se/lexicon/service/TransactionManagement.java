package se.lexicon.service;

import se.lexicon.model.Cryptocurrency;
import se.lexicon.model.Transaction;

import java.math.BigDecimal;
import java.util.List;

public interface TransactionManagement {
    Transaction createDepositTransaction(String walletId, Cryptocurrency cryptocurrency, BigDecimal amount, String description);

    Transaction createWithdrawTransaction(String walletId, Cryptocurrency cryptocurrency, BigDecimal amount, String description);

    List<Transaction> getTransactionsByWalletId(String walletId);
}
