package se.lexicon.Dao;

import se.lexicon.model.Wallet;

import java.util.Optional;

public interface WalletDao {
    Wallet createWallet(Wallet wallet);

    Optional<Wallet> findWalletById(String id);
    //...
}
