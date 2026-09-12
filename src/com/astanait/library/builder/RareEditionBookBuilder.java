package com.astanait.library.builder;

import com.astanait.library.model.CoverType;

public class RareEditionBookBuilder extends AbstractBookBuilder<RareEditionBookBuilder> {

    private static final CoverType DEFAULT_COVER_TYPE = CoverType.HARDCOVER;

    public RareEditionBookBuilder setPageCount(int pageCount) {
        book.setPageCount(pageCount);
        return this;
    }

    public RareEditionBookBuilder setEstimatedValue(double estimatedValue) {
        book.setEstimatedValue(estimatedValue);
        return this;
    }

    public RareEditionBookBuilder setLimitedEditionNumber(int limitedEditionNumber) {
        book.setLimitedEditionNumber(limitedEditionNumber);
        return this;
    }

    @Override
    protected RareEditionBookBuilder self() {
        return this;
    }

    @Override
    protected void applyDefaults() {
        book.setCoverType(DEFAULT_COVER_TYPE);
    }
}