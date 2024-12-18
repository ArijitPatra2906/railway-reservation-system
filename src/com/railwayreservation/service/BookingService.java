package com.railwayreservation.service;

import java.util.List;

import com.railwayreservation.beans.HistoryBean;
import com.railwayreservation.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
