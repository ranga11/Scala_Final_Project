# Scala_Final_Project
Sentiment Analysis of News/Social Media feeds on Stock Market

This is the CSYE7200 Big Data Systems Engineering Using Scala Final Project for Team 10 Fall 2018

# Team members:
Vinyas Kaushik Tumakunte Raghavendrarao -> tumakunteraghaven.v@husky.neu.edu
Ranga Chari Vinjamuri  -> vinjamuri.r@husky.neu.edu

# Methodology

Data cleaning and parsing:
1. Data from all the companies CSV was loaded into dataframes and converted to format required by ARIMA model.

# Spark Timeseries Methodology

1. A time series is a series of data points indexed (or listed or graphed) in time order. Most commonly, a time series is a sequence taken at successive equally spaced points in time.

2. Company name and dates were taken as features to train the data using ARIMA model.

3. Dataframes of all the companies were joined and loaded to RDD.

4. Using ARIMA model data is trained and model is then used for forecasting future values.


# Twitter Sentiment Analysis

1.Tweets acquired by Search API are in JSON format with a maximum limit of 100 per request. Built a JSON parser to correctly parse the and filter those attributes which are not required.

2.Special characters are removed to increase the accuracy of the sentiment scores.

3.Using Stanford NLP to calculate the sentiment score which tells whether the particular tweet is positive or negative.

4.Using Spark Streaming to receive the stream of tweets and perform the analysis.

# Web Application and Visualization

1.Web application is created using Play framework.

2.Data is send from controller to view using Akka framework.

3.User should be able to either signUp or login to view the dashboard.


# Steps to run the project on the local machine

Run on windows and mac

Download sbt 0.13.17

Configure Java 1.8 on your machine

Configure scala 2.11.8 on your machine

To run from terminal go to the Stock-Market-Prediction and write sbt run.

Also make sure to configure your database in config file so that you can signUp and login to the application.


