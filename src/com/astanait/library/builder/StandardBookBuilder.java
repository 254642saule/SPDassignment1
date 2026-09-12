package com.astanait.library.builder;

import com.astanait.library.model.CoverType;

public class StandardBookBuilder extends AbstractBookBuilder<StandardBookBuilder> {

    private static final int DEFAULT_PAGE_COUNT = 200;
    private static final CoverType DEFAULT_COVER_TYPE = CoverType.PAPERBACK;

    public StandardBookBuilder setPageCount(int pageCount) {
        book.setPageCount(pageCount);
        return this;
    }

    public StandardBookBuilder setCoverType(CoverType coverType) {
        book.setCoverType(coverType);
        return this;
    }

    @Override
    protected StandardBookBuilder self() {
        return this;
    }

    @Override
    protected void applyDefaults() {
        book.setPageCount(DEFAULT_PAGE_COUNT);
        book.setCoverType(DEFAULT_COVER_TYPE);
    }
}