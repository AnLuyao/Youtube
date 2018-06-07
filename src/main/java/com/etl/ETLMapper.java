package com.etl;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

/**
 * @author AnLuyao
 * @date 2018-05-21 11:50
 */
public class ETLMapper extends Mapper<LongWritable,Text,NullWritable,Text> {
    Text text = new Text();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        

    }
}
