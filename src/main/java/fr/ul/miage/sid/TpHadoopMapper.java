package fr.ul.miage.sid;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import java.io.IOException;

public class TpHadoopMapper extends Mapper<LongWritable, Text, Text, IntWritable> {
    
}
