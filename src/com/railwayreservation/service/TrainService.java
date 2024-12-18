package com.railwayreservation.service;

import java.util.List;

import com.railwayreservation.beans.TrainBean;
import com.railwayreservation.beans.TrainException;

public interface TrainService {

	public String addTrain(TrainBean train);

	public String deleteTrainById(String trainNo);

	public String updateTrain(TrainBean train);

	public TrainBean getTrainById(String trainNo) throws TrainException;

	public List<TrainBean> getAllTrains() throws TrainException;

	public List<TrainBean> getTrainsBetweenStations(String fromStation, String toStation) throws TrainException;
}
