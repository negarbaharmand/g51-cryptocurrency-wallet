package se.lexicon.Dao.impl;

import org.springframework.stereotype.Component;
import se.lexicon.Dao.TransactionDao;
import se.lexicon.model.Transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TransactionDaoImpl implements TransactionDao {

    private List<Transaction> storage;

    public TransactionDaoImpl() {
        this.storage = new ArrayList<>();
    }

    @Override
    public Transaction createTransaction(Transaction transaction) {
        storage.add(transaction);
        return transaction;
    }

    @Override
    public Optional<Transaction> findById(String id) {
        return storage.stream()
                .filter(transaction -> transaction.getId().equals(id))
                .findFirst();
    }

    @Override
    public List<Transaction> findTransactionByWalletId(String walletId) {
        return storage.stream()
                .filter(transaction -> transaction.getWalletId().equals(walletId))
                .collect(Collectors.toList());
    }
}
