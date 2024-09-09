package se.lexicon.service;

import se.lexicon.model.Wallet;

public interface WalletManagement {
    Wallet create(String walletName);

    Wallet getById(String id);

    // ...
}
